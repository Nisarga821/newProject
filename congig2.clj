{:fivetran
 {:api-key "your_api_key"
  :api-secret "your_api_secret"
  :connector-id "connector_12345"

  ;; Sync settings
  :sync
  {:frequency-minutes 60
   :sync-mode "incremental"
   :pause-after-failure true}}

 :database
 {:host "34.100.200.10"
  :port 5432
  :name "sales_db"
  :user "fivetran_user"
  :password "your_password"}   ;; 🔐 keep secure

 :destination
 {:type "snowflake"
  :account "company.snowflakecomputing.com"
  :warehouse "COMPUTE_WH"
  :database "ANALYTICS"
  :schema "PUBLIC"}

 ;; Error handling section
 :error-handling
 {:retry-count 3
  :retry-delay-seconds 30
  :alert-email "admin@company.com"

  ;; Custom error codes
  :error-codes
  {:connection-failed 1001
   :authentication-failed 1002
   :sync-failed 1003
   :timeout 1004}}}